package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfOneGuids_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneListOfOneGuids: IndexedSeq[java.util.UUID]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfOneGuids_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfOneGuids_2("+ URI +")"

   def copy(oneListOfOneGuids: IndexedSeq[java.util.UUID] = this._oneListOfOneGuids): OneListOfOneGuids_2 = {

  require(oneListOfOneGuids ne null, "Null value was provided for property \"oneListOfOneGuids\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneGuids)
    new OneListOfOneGuids_2(_URI = this.URI, __locator = this.__locator, _oneListOfOneGuids = oneListOfOneGuids)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfOneGuids_2): this.type = {
    this._URI = result._URI
    this._oneListOfOneGuids = result._oneListOfOneGuids
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfOneGuids_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneListOfOneGuids")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfOneGuids = {
    _oneListOfOneGuids
  }

  def oneListOfOneGuids_= (value: IndexedSeq[java.util.UUID]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneListOfOneGuids = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneGuids") oneListOfOneGuids: IndexedSeq[java.util.UUID]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneListOfOneGuids = if (oneListOfOneGuids == null) IndexedSeq.empty else oneListOfOneGuids)

}

object OneListOfOneGuids_2 extends AggregateRootCompanion[OneListOfOneGuids_2]{

  def apply(
    oneListOfOneGuids: IndexedSeq[java.util.UUID] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneGuids)
    require(oneListOfOneGuids ne null, "Null value was provided for property \"oneListOfOneGuids\"")
    new OneListOfOneGuids_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneListOfOneGuids = oneListOfOneGuids)
  }

}
