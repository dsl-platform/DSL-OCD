package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneStrings_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneArrayOfOneStrings: Array[String]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneStrings_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneStrings_2("+ URI +")"

   def copy(oneArrayOfOneStrings: Array[String] = this._oneArrayOfOneStrings): OneArrayOfOneStrings_2 = {

  require(oneArrayOfOneStrings ne null, "Null value was provided for property \"oneArrayOfOneStrings\"")
  com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneStrings)
    new OneArrayOfOneStrings_2(_URI = this.URI, __locator = this.__locator, _oneArrayOfOneStrings = oneArrayOfOneStrings)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfOneStrings_2): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneStrings = result._oneArrayOfOneStrings
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfOneStrings_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneStrings")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneStrings = {
    _oneArrayOfOneStrings
  }

  def oneArrayOfOneStrings_= (value: Array[String]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _oneArrayOfOneStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneStrings") oneArrayOfOneStrings: Array[String]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneArrayOfOneStrings = if (oneArrayOfOneStrings == null) Array.empty else oneArrayOfOneStrings)

}

object OneArrayOfOneStrings_2 extends AggregateRootCompanion[OneArrayOfOneStrings_2]{

  def apply(
    oneArrayOfOneStrings: Array[String] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneStrings)
    require(oneArrayOfOneStrings ne null, "Null value was provided for property \"oneArrayOfOneStrings\"")
    new OneArrayOfOneStrings_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneArrayOfOneStrings = oneArrayOfOneStrings)
  }

}
