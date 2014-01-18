package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneGuids_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneArrayOfOneGuids: Array[java.util.UUID]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneGuids_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneGuids_2("+ URI +")"

   def copy(oneArrayOfOneGuids: Array[java.util.UUID] = this._oneArrayOfOneGuids): OneArrayOfOneGuids_2 = {

  require(oneArrayOfOneGuids ne null, "Null value was provided for property \"oneArrayOfOneGuids\"")
  com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneGuids)
    new OneArrayOfOneGuids_2(_URI = this.URI, __locator = this.__locator, _oneArrayOfOneGuids = oneArrayOfOneGuids)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfOneGuids_2): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneGuids = result._oneArrayOfOneGuids
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfOneGuids_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneGuids")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneGuids = {
    _oneArrayOfOneGuids
  }

  def oneArrayOfOneGuids_= (value: Array[java.util.UUID]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _oneArrayOfOneGuids = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneGuids") oneArrayOfOneGuids: Array[java.util.UUID]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneArrayOfOneGuids = if (oneArrayOfOneGuids == null) Array.empty else oneArrayOfOneGuids)

}

object OneArrayOfOneGuids_2 extends AggregateRootCompanion[OneArrayOfOneGuids_2]{

  def apply(
    oneArrayOfOneGuids: Array[java.util.UUID] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneGuids)
    require(oneArrayOfOneGuids ne null, "Null value was provided for property \"oneArrayOfOneGuids\"")
    new OneArrayOfOneGuids_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneArrayOfOneGuids = oneArrayOfOneGuids)
  }

}
