package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfOneFloats_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneListOfOneFloats: IndexedSeq[Float]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfOneFloats_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfOneFloats_2("+ URI +")"

   def copy(oneListOfOneFloats: IndexedSeq[Float] = this._oneListOfOneFloats): OneListOfOneFloats_2 = {

  require(oneListOfOneFloats ne null, "Null value was provided for property \"oneListOfOneFloats\"")
    new OneListOfOneFloats_2(_URI = this.URI, __locator = this.__locator, _oneListOfOneFloats = oneListOfOneFloats)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfOneFloats_2): this.type = {
    this._URI = result._URI
    this._oneListOfOneFloats = result._oneListOfOneFloats
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfOneFloats_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneListOfOneFloats")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfOneFloats = {
    _oneListOfOneFloats
  }

  def oneListOfOneFloats_= (value: IndexedSeq[Float]) {
    _oneListOfOneFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneFloats") oneListOfOneFloats: IndexedSeq[Float]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneListOfOneFloats = if (oneListOfOneFloats == null) IndexedSeq.empty else oneListOfOneFloats)

}

object OneListOfOneFloats_2 extends AggregateRootCompanion[OneListOfOneFloats_2]{

  def apply(
    oneListOfOneFloats: IndexedSeq[Float] = IndexedSeq.empty
  ) = {
    require(oneListOfOneFloats ne null, "Null value was provided for property \"oneListOfOneFloats\"")
    new OneListOfOneFloats_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneListOfOneFloats = oneListOfOneFloats)
  }

}
